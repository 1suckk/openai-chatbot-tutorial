- application.properties 파일에서 각자 openai api key로 대체해서 넣으시면 됩니다 - "" 붙이지 말고 api key만 그대로!
  - openai api key를 등록하고 결제하는 방법은 아래의 블로그를 참조해 주세요!
  - https://wikidocs.net/196075
- openai api key는 최소 5달러부터 결제가 가능합니다
- 글자의 수 등은 각자가 필요한 만큼 수정하시면 됩니다 글자의 수가 많아지면 토큰이 많이 소비됩니다.
- 초기의 버젼이기에 css, js등은 포함되어 있지 않습니다. 각자의 바리에이션에 맞게 수정하시면 됩니다.

- 우선 코드에서 수정할 부분은 application.properties에서 api key만 넣으시고, 서버 구동 후 localhost:8080/으로 브라우저에서 들어가시면 프롬프트를 입력하는 창이 나옵니다 입력하시고 send버튼 누르시면  5초 후에 바로 밑 div에 답변이 생성됩니다

- 인벤토리
  - spring boot 3.4.3
  - java 17
  - thymeleaf
  - openai
  - html 
