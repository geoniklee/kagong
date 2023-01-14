import React from "react";
import styled from "styled-components";
import CafeListElement from "../data/cafeListElement";
import { Link } from "react-router-dom";
import { Swiper, SwiperSlide } from "swiper/react";
import SwiperCore, { Navigation, Pagination } from "swiper";
import "swiper/swiper.scss";
import "swiper/components/pagination/pagination.scss";
import "swiper/components/navigation/navigation.scss";

const MyPage = () => {

    SwiperCore.use([Navigation,Pagination]);

    const lastCafes = CafeListElement.cafe.map((el)=>{
      return(         
          <div key={el.id}>
            <img className="imgBox" src={el.img} alt=""/>
            <div className='name'> {el.name}</div>
            <div className='time'> {el.time}</div>
          </div>
        )
    })
    const lineCafes = CafeListElement.cafe.map((el)=>{
      return(
        <div key={el.id}>
          <div className='name'> {el.name}</div>
          <div className='time'> {el.time}</div>
          <div className="tags"> {el.tags}</div>
          <img className="img" src={el.img} alt=""/>
          <div className="num_of_reviewBox"> {el.num_of_review}</div>
        </div>
      )
    })

  return(
    <>
      <Container>
        <MyBox>
           <Link to="/home"><img src="back.png" alt=""/></Link>
            <div className = "img_container">
              <img src="picture5.png"/>
            </div>
            <div className="title_container">
              <h1>김가영 님</h1>
              <h2>반갑습니다!</h2>
            </div>
        </MyBox>
        <RecommendBox>
          <h1>최근 다녀온 카페</h1>
          <StyledSwiper>
            <SwiperSlide>
              <CafeStyle>
                {
                lastCafes
                }
              </CafeStyle>
            </SwiperSlide>
          </StyledSwiper>
          <h2>내가 쓴 리뷰</h2>

          <SwiperStyle>
            <SwiperSlide>
              <LineStyle>
              {
                lineCafes
              }
              </LineStyle>
              <LineStyle>
              {
                lineCafes
              }
              </LineStyle>
            </SwiperSlide>
          </SwiperStyle>

        <SwiperStyle>
            <SwiperSlide>
              <LineStyle>
              {
                lineCafes
              }
              </LineStyle>
            </SwiperSlide>
          </SwiperStyle>
        </RecommendBox>

      </Container>
    </>
  )
}

export default MyPage;

const StyledSwiper = styled(Swiper)`
 position: relative;
 width: 330px;
 height: 150px;
 margin-top:50px;
 margin-bottom:50px;
`

const CafeStyle = styled.div`
  width: 397px;
  height: 163px;
  display: flex;

  .imgBox {
    width: 100px;
    height: 80px;
    margin-right:15px;
  }

  .name {
    width: 105px;
    height: 30px;

    font-family: 'Inter';
    font-weight: 600;
    font-size: 15px;
    line-height: 150%;

    color: #000000;
  }

  .time {
    width: 105px;
    height: 19px;

    font-family: 'Inter';
    font-style: normal;
    font-weight: 600;
    font-size: 13px;
    line-height: 150%;

    color: #808080;
  }

`

const SwiperStyle = styled(Swiper)`
 position: relative;
 display: flex;
 width: 320px;
 height: 140px;
 border-top: 2px solid #6C4E36;
`

const LineStyle = styled.div`
    display: flex;
    width: 320px;
    height: 140px;

  .name {
    display: felx;
    width: 105px;
    height: 30px;
    margin-left: 10px;
    top: 344px;
    float:left;
    margin-top: 25px;
    
    font-family: 'Inter';
    font-weight: 600;
    font-size: 15px;
    line-height: 150%;

    color: #000000;
  }

  .time {
    position: absolute;
    width: 105px;
    height: 19px;
    margin-left: 10px;
    margin-top: 45px;

    font-family: 'Inter';
    font-style: normal;
    font-weight: 600;
    font-size: 13px;
    line-height: 150%;

    color: #808080;
  }

  .tags {
    display: felx;
    width: 350px;
    height: 10px;
    margin-left: 10px;
    margin-top: 60px;

    font-weight: 600;
    font-size: 15px;
    line-height: 150%;

    color: #BD6C34;
  }

  .img {
    position: relative;
    display: felx;
    width: 90px;
    height: 90px;
    float:right;
    margin-right:45px;
    margin-top: -50px;
  }

  .num_of_reviewBox {
    position: absolute;
    width: 30px;
    height: 20px;
    float:right;
    margin-left: 295px;
    margin-top: 45px;
    
    font-family: 'Inter';
    font-style: normal;
    font-weight: 400;
    font-size: 12px;
    line-height: 150%;

    color: #1E1E1E;

  }
`

const Container = styled.div`
  width: 100%;
  height: 100%;
`
const MyBox = styled.div`
  width: 100%;
  height: 15%;
  padding-top: 20px;
  box-sizing: border-box;

  img {
    width: 40px;
    height: 40px;
    padding-left: 12px;
    padding-top: 5px;
  }
  
  .img_container {
    display: flex;
    
    img {
        position: absolute;
        width: 72.06px;
        height: 70px;
        left: 265px;
        top: 20px;
        

    }
  }
  
  .title_container{  
    h1{
      position: absolute;
      width: 280px;
      height: 27px;
      left: -15px;
      top: 30px;
      font-size: 16px;
      line-height: 150%;
      letter-spacing: -0.019em;
      color: #4D2E14;
      text-align: right;
    }

    h2{
      position: absolute;
      width: 280px;
      height: 27px;
      left: -15px;
      top: 50px;
      font-size: 16px;
      line-height: 150%;
      letter-spacing: -0.019em;
      color: #4D2E14;
      text-align: right;
    }
  }
 
  }
`
const RecommendBox = styled.div`
  width: 100%;
  height: 82%;
  padding-top: 5px;

  h1 {
    position: absolute;
    width: 287px;
    height: 27px;
    left: -60px;
    top: 100px;

    font-weight: 600;
    font-size: 16px;

    text-align: center;
    line-height: 30px;

    color: #6C4E36;
  }

  h2 {
    position: absolute;
    width: 287px;
    height: 27px;
    left: -75px;
    top: 300px;

    font-weight: 600;
    font-size: 16px;

    text-align: center;
    line-height: 30px;

    color: #6C4E36;
  }


`