import React from "react";
import { FlexBox1 } from "../components/global";


const Signup = () => {
  return(
    <>
      <FlexBox1>
        <div className = 'top'>
          <div className = "top_container">
            <div className = "img_container">
              <img src="그림2.png"/>
            </div>
            <div className="title_container">
              <h1>회원가입</h1>
            </div>
          </div>
        </div>
        <div className = 'mid'>
        <div className="login" style={{marginBottom: 12}}>
          <div className="imageBox"><img src="mail.png" alt="" /></div>
          <input className="email"
            name="email"
            type="text"
            placeholder="이메일 아이디 입력"
          />
          </div>

          <div className="login" style={{marginBottom: 12}}>
          <div className="imageBox"><img src="password.png" alt="" /></div>
          <input className="email"
            name="email"
            type="text"
            placeholder="비밀번호 입력"
          />
          </div>

          <div className="login" style={{marginBottom: 48}}>
          <div className="imageBox"><img src="password.png" alt="" /></div>
          <input className="email"
            name="email"
            type="text"
            placeholder="비밀번호 한 번 더 입력 "
          />
          </div>    
        </div>
        <div className = 'bottom'>
          <button className="mainBtn" style={{marginBottom: 60}}>Sign up</button>
          <div className="subBtnArea">
            <div className="snsSignup">
              <button className="kakaoTalk"><img src="카카오톡.png" alt=""></img></button>
              <button className="naver"><img src="네이버.png" alt=""></img></button>
              <button className="apple"><img src="애플.png" alt=""></img></button>
              <p className="snsText">SNS로 회원가입하기</p>
            </div>
          </div>
        </div>
      </FlexBox1>
    </>
  )
}

export default Signup