// Excercise 컴포넌트
// 1. useState 함수로 컴포넌트 상태 관리
// 2. useLocation 함수로 현재 URL 가져오기
// 3. styled.js 파일에서 정의한 ExerciseButton, Pointblock, Block, ExerciseContainer 컴포넌트 사용
// 4. Outlet 컴포넌트로 라우트 경로에 따라 다른 컴포넌트 렌더링

//

import { useState } from "react"; // react의 useState 함수 사용
import * as styled from "./style.js"; // styled.js 파일에서 정의한 스타일들 가져오기
import ExerciseButton from "components/ExerciseButton"; // ExerciseButton 컴포넌트 가져오기
import { useLocation, Outlet } from "react-router-dom"; // react-router-dom의 useLocation, Outlet 함수 사용

const buttonAttribute = [
  //객체를 요소로 가지는 배열
  {
    color: "red",
    part: "스쿼트",
  },
  {
    color: "blue",
    part: "플랭크",
  },
  {
    color: "green",
    part: "러닝",
  },
  {
    color: "red",
    part: "어깨",
  },
  {
    color: "blue",
    part: "하체",
  },
];
// Excercise 컴포넌트 정의
const Excercise = () => {
  const [운동주제, set운동주제] = useState("헬스"); // 운동주제를 관리하는 상태 선언 및 초기화
  const [총운동시간, set총운동시간] = useState(0); // 총운동시간을 관리하는 상태 선언 및 초기화
  const [mark, setMark] = useState([]);
  const[Date,SetDate]=useState("2023/2/7")
  const location = useLocation(); //현재 URL을 가져온다
  const currentUrl = location.pathname; // 가져온 URL 정보에서 pathname 속성값을 가져와 currentUrl 변수에 저장
  //즉, 현재 URL을 currentUrl 변수에 저장하고 있다는 것

  return (
    <div>
      <styled.Pointblock>
        <h2>🏃‍♂️{운동주제}</h2>
      </styled.Pointblock>
    <div>
      <styled.Block>
        <div>총 운동시간</div>
        <div>{총운동시간}초</div>
      </styled.Block>
      
     
    </div>
      {currentUrl != "/exercise" ? ( //현재 URL이 "/exercise"가 아니라면 <Outlet /> 컴포넌트만이 렌더링. 타이머가 렌더링?
        <>
          <Outlet />
        </>
      ) : (
        //현재 URL이 "/exercise"라면 styled.ExerciseContainer 컴포넌트가 렌더링
        <>
        <styled.DateContainer>
        <styled.NextButton>«</styled.NextButton>
        <div>{Date}</div>
        <styled.NextButton>»</styled.NextButton>
        </styled.DateContainer>
          <styled.ExerciseContainer>
            {buttonAttribute.map(
              (
                element //styled.ExerciseContainer는 buttonAttribute 배열을 map()함수를 사용하여 '반복'하면서 ExerciseButton 컴포넌트를 렌더링
              ) => (
                <ExerciseButton color={element.color} part={element.part} />
              )
            )}
          </styled.ExerciseContainer>

          <styled.AddButton>
            {" "}
            <div>+</div>{" "}
          </styled.AddButton>
        </>
      )}
    </div>
  );
};

export default Excercise;
