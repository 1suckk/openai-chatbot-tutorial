package chat.controller;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final OpenAiChatModel openAiChatModel;

    @Autowired
    public ChatController(OpenAiChatModel openAiChatModel) {
        this.openAiChatModel = openAiChatModel;
    }

    @PostMapping("/chat")
    public String getResponse(@RequestBody String prompt) {
        ChatResponse response = openAiChatModel.call(new Prompt(prompt));
        if (response != null && response.getResult() != null)
        {
            return response.getResult().getOutput().getText();
        }
        else
        {
            return "Error: Unable to process the request.";
        }
    }
}
