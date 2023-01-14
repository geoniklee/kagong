import React, { useState, useEffect } from 'react';
import axios from 'axios'
import { BrowserRouter, Route, Routes } from "react-router-dom"
import Home from "./pages/home"
import Signup from "./pages/signup"
import Login from "./pages/login"
import Start from "./pages/start"
import Cafelist from "./pages/cafelist"
import MyPage from "./pages/mypage"
import styled from "styled-components"

function App(){
  const [ testStr, setTestStr ] = useState('');

  function callback(str) {
    setTestStr(str);
  }

  useEffect(
      () => {
        axios({
          url: '/home',
          method: 'GET'
        }).then((res) => {
          callback(res.data);
        })
      }, []
  );

  return (
      <div className="App">
        <header className="App-header">

          {testStr}
        </header>
      </div>
  );
}

// const App = () => {
//   return(
//     <Frame>
//     <BrowserRouter>
//       <Routes>
//         <Route path="/*" element={<Home/>}/>
//         <Route path="/signup" element={<Signup/>}/>
//         <Route path="/login" element={<Login/>}/>
//         <Route path="/start" element={<Start/>}/>
//         <Route path="/cafelist" element={<Cafelist/>}/>
//         <Route path="/mypage" element={<MyPage/>}/>
//       </Routes>
//     </BrowserRouter>
//     </Frame>
//   )
// }

export default App;

const Frame = styled.div`
  width: 375px;
  height: 667px;
  border: 1px solid black;
  box-sizing: border-box;
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  margin: auto;
`