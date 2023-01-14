import React from "react";
import styled from "styled-components";

const Home = () => {
  return(
    <>
      <Container>
        <SearchBox>
          <div className="btn"><img src="search.png" alt="" /></div>
          <input className="search"
            name="search"
            type="text"
            placeholder="현재 위치 및 카페 이름 검색"
          />
          <div className="btn_filter">
            <div>[ FILTER 바로가기 ]</div>
          </div>
        </SearchBox>
        <MapBox>
          <img src="map.png"/>
        </MapBox>
      </Container>
    </>
  )
}

export default Home;

const Container = styled.div`
  width: 100%;
  height: 100%;
`
const SearchBox = styled.div`
  width: 100%;
  height: 18%;
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
  .search::placeholder{
    color: #323232;
    font-size: 16px;
  }
  .btn_filter{
    display: flex;
    justify-content: center;
    margin-top: 15px;
    font-weight: 600;
    line-height: 150%;
  }
`
const MapBox = styled.div`
  width: 100%;
  height: 82%;
  img{
    width: 100%;
    height: 100%;
    object-fit: cover;
  }
`