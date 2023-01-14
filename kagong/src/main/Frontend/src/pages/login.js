import React from "react";
import { FlexBox1 } from "../components/global";


const Login = () => {
  return(
    <>
      <FlexBox1>
        <div className = 'top'>
          <div className = "top_container">
            <div className = "img_container">
              <img src="그림1.png"/>
            </div>
            <div className="title_container">
              <h1>LOGIN</h1>
            </div>
          </div>
        </div>
        <div className = 'mid'>

          <div className="login" style={{marginBottom: 21}}>
          <div className="imageBox"><img src="mail.png" alt="" /></div>
          <input className="email"
            name="email"
            type="text"
            placeholder="이메일 아이디 입력"
          />
          </div>

          <div className="login" style={{marginBottom: 43}}>
          <div className="imageBox"><img src="password.png" alt="" /></div>
          <input className="email"
            name="email"
            type="text"
            placeholder="비밀번호 입력"
          />
          </div>
        </div>
        <div className = 'bottom'>
          <button className="mainBtn">Log in</button>
          <div className="subBtnArea">
            <div className="member">
              <button className="findPasswordBtn">비밀번호 찾기</button>
              <button className="signupBtn">회원가입 하기</button>
            </div>
            <div className="non-member">
              <button className="non-signupBtn">비회원으로 이용하기</button>
            </div>
          </div>
        </div>
      </FlexBox1>
    </>
  )
}

export default Login