import React from "react";
import { FlexBox1 } from "../components/global";


const Start = () => {
  return(
    <>
      <FlexBox1>
        <div className = 'top'>
          <div className = "top_container">
            <div className = "img_container">
              <img src="그림5.png"/>
            </div>
            <div className="title_container">
              <h1>환영합니다!</h1>
            </div>
            <div className="sub_container">
              <p>카페를 찾고 싶은 캠퍼스를<br/>선택해주세요.</p>
            </div>
          </div>
        </div>
        <div className = 'mid'>
          <div className="btn"><img src="search.png" alt="" /></div>
          <input className="search" style={{marginBottom: 51}}
            name="search"
            type="text"
          /> 
        </div>
        <div className = 'bottom'>
          <button className="mainBtn">START!</button>
        </div>
      </FlexBox1>
    </>
  )
}

export default Start