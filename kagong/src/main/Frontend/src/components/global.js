import styled from "styled-components";

// login.js, signup.js, start.js
export const FlexBox1 = styled.div`
@import url('https://fonts.googleapis.com/css2?family=Inter:wght@500;600;700&display=swap'); 
  font-family: 'Inter';
  display: flex;
  flex-direction: column;
  justify-content: center;
  height: 100%;
  width: 100%;
  & div.top,
    div.mid,
    div.bottom{
    /* border: 1px solid black; */
    .top_container{
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      margin-bottom: 20px;
    }
    .title_container>h1{
      font-size: 36px;
      line-height: 150%;
      text-align: center;
      letter-spacing: -0.019em;
      margin-bottom: 0px;
      margin-top: 10px;
    }
    .sub_container>p{
      text-align: center;
      color: #CBB292;
      font-size: 20px;
      line-height: 24px;
      font-weight: 600;
      margin-bottom: 30px;
    }
    .login {
        display: flex;
        flex-direction: column;
        box-sizing: border-box;
    
        width: 297px;
        height: 46px;
        background: #FFFFFF;
        border: 1px solid #000000;
        border-radius: 5px;

        margin:auto;

      .email{ 
        border-style: none;
        width: 200px;
        height: 46px;
        margin-left:50px;
        background: #FFFFFF;
        padding-top:5px;
        
        
        &::placeholder{
          font-family: 'Inter';
          font-style: normal;
          font-weight: 500;
          font-size: 20px;
          line-height: 150%;

          letter-spacing: -0.019em;
          color: #1E1E1E;


        }

      }

      .imageBox {
        display: flex;
        flex-direction: column;
        
        img {
          position: absolute;
          width: 32px;
          height: 30px;
          margin: auto;
          padding-left: 10px;
          padding-top:5px;
        }
      }  
    }

    .btn{
      display: flex;
      flex-direction: column;
      
      img {
        position: absolute;
        width: 32px;
        height: 30px;
        display: block;
        margin-left:300px;
        padding-top:7px;
      }
    }

    .search {
      display: flex;
      flex-direction: column;
      box-sizing: border-box;
      width: 319.63px;
      height: 46.44px;
      margin: auto; 
      background: #FFFFFF;
      border: 1px solid #000000;
      border-radius: 5px;
      
    }
    
  }
  // 밑에 bottom 영역

  .mainBtn { /*커피색 메인 버튼*/
    width: 290px; /* 뷰포트가 작아져서 버튼 width 임의로 줄임... */
    height: 49px;
    border-radius: 50px;
    border-style: none;
    background-color: #CBB292;

    margin: auto;
    margin-bottom: 80px; /* 뷰포트가 작아져서 얘도 일단 줄임... */

    font-family: 'Inter', sans-serif;
    font-weight: 700;
    font-size: 22px;
  }

  .findPasswordBtn { /*login - 비밀번호 찾기 버튼*/
      width: 159px;
      height: 23px;
      border-style: none;
      background-color: white;

      font-family: 'Inter', sans-serif;
      font-weight: 600;
      font-size: 17px; /* 뷰포트가 작아져서 폰트사이즈 임의로 줄임... */
  }

  .signupBtn { /*login - 회원가입 하기 버튼*/
      width: 159px;
      height: 35px;
      border-style: none none none solid;
      background-color: white;

      font-family: 'Inter', sans-serif;
      font-weight: 600;
      font-size: 17px; /* 뷰포트가 작아져서 폰트사이즈 임의로 줄임... */
  }

  .non-signupBtn { /*login - 비회원으로 이용하기 버튼*/
      width: 190px;
      height: 35px;
      background-color: white;
      border-style: none;

      font-family: 'Inter', sans-serif;
      font-weight: 600;
      color: #CBB292;
      font-size: 16px; /* 뷰포트가 작아져서 폰트사이즈 임의로 줄임... */

      margin-top: 20px;
  }

  .snsText { /*signup - SNS회원가입 안내 문구*/
      font-family: 'Inter', sans-serif;
      font-weight: 600;
      color: #CBB292;
      font-size: 16px; /* 뷰포트가 작아져서 폰트사이즈 임의로 줄임... */

      margin-top: 20px;
  }

  .subBtnArea { /*메인버튼 밑에 잡다한 버튼 영역 묶어놓음*/
      margin: auto;
  }

  .bottom {
      display:flex;
      flex-direction: column;
  }

  .member { /*login - 비밀번호 찾기/회원가입 -> 멤버 가입하는 버튼들 영역*/
      margin: auto;
  }

  .non-member { /*login - 비회원으로 이용 -> 멤버 가입하지 않는 영역*/
      width: 190px;
      margin: 0 auto;
  }

  .snsSignup { /*signup - SNS회원가입버튼들 영역*/
      margin: auto;
  }

  .kakaoTalk { /*signup - 카카오톡으로 회원가입 버튼*/
      border: none;
      background-color: white;
      padding: 5px;
  }

  .naver { /*signup - 네이버로 회원가입 버튼*/
      border: none;
      background-color: white;
      padding: 5px;
  }

  .apple { /*signup - 애플계정으로 회원가입 버튼*/
      border: none;
      background-color: white;
      padding: 5px;
  }
`