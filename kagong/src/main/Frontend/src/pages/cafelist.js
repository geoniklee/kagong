import React from "react";
import styled from "styled-components";
import CafeListElement from "../data/cafeListElement";
import { Swiper, SwiperSlide } from "swiper/react";
import SwiperCore, { Navigation, Pagination } from "swiper";
import "swiper/swiper.scss";
import "swiper/components/pagination/pagination.scss";
import "swiper/components/navigation/navigation.scss";

const Cafelist = () => {

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
        <SearchBox>
          <div className="btn"><img src="search.png" alt="" /></div>
          <input className="search"
            name="search"
            type="text"
          />
          <div className="btn_filter">
            <div>"경기도 안산시 사동 한양대학로"</div>
          </div>
        </SearchBox>
        <RecommendBox>
          <h1>카페 추천</h1>
          <button className="btn_a">#혼공하기 좋은</button>
          <button className="btn_b">#작업하기 좋은</button>
          <StyledSwiper>
            <SwiperSlide>
              <CafeStyle>
                {
                lastCafes
                }
              </CafeStyle>
            </SwiperSlide>
          </StyledSwiper>

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

export default Cafelist;

const StyledSwiper = styled(Swiper)`
 position: relative;
 width: 330px;
 height: 163px;
 margin-top:100px;
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
const SearchBox = styled.div`
  width: 100%;
  height: 15%;
  background-color: #CBB292;
  padding-top: 20px;
  box-sizing: border-box;
  .btn{
      display: flex;
      flex-direction: column;
      
      img {
        position: absolute;
        width: 32px;
        height: 30px;
        display: block;
        margin-left:310px;
        padding-top:4px;
      }
    }

  .search {
    display: flex;
    flex-direction: column;
    box-sizing: border-box;
    width: 330px;
    height: 40px;
    margin: auto; 
    background: #FFFFFF;
    border: 1px solid #000000;
    border-radius: 5px;
    padding: 10px;
  }

  .btn_filter{
    display: flex;
    justify-content: center;
    margin-top: 15px;
    font-weight: 600;
    font-size: 15px;
    line-height: 150%;
  }
`
const RecommendBox = styled.div`
  width: 100%;
  height: 85%;
  padding-top: 5px;

  h1 {
    position: absolute;
    width: 287px;
    height: 27px;
    left: 45px;
    top: 100px;

    font-weight: 600;
    font-size: 16px;

    text-align: center;
    line-height: 30px;

    color: #6C4E36;
  }

  .btn_a {
    position: absolute;
    width: 140px;
    height: 32px;
    left: 18px;
    top: 150px;

    border-width: thin;
    border-color: #DCDCDC;
    border-radius: 50px;
    background-color: white;

    font-weight: 600;
    font-size: 16px;
    line-height: 150%;

    color: #BD6C34;
  }

  .btn_b {
    position: absolute;
    width: 140px;
    height: 32px;
    left: 170px;
    top: 150px;

    border-width: thin;
    border-color: #DCDCDC;
    border-radius: 50px;
    background-color: white;

    font-weight: 600;
    font-size: 16px;
    line-height: 150%;

    color: #BD6C34;
  }
`
