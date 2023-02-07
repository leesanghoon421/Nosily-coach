import { useState } from "react"; // react의 useState 함수 사용
import * as styled from "./style.js"; // styled.js 파일에서 정의한 스타일들 가져오기
import ExerciseButton from "components/ExerciseButton"; // ExerciseButton 컴포넌트 가져오기
import { Link, useLocation, Outlet } from "react-router-dom"; // react-router-dom의 useLocation, Outlet 함수 사용

import ContentsBox from "components/ContentsBox";
import SubTitle from "components/SubTitle/index.js";

const buttonAttribute = [
  //객체를 요소로 가지는 배열
  {
    part: "스쿼트",
  },
  {
    part: "플랭크",
  },
  {
    part: "러닝",
  },
  {
    part: "어깨",
  },
  {
    part: "하체",
  },
];

const Today = ({ setSubCategory }) => {
  const [운동주제, set운동주제] = useState("헬스"); // 운동주제를 관리하는 상태 선언 및 초기화
  const [총운동시간, set총운동시간] = useState(0); // 총운동시간을 관리하는 상태 선언 및 초기화
  const [mark, setMark] = useState([]);
  const [Date, SetDate] = useState("2023/2/7");
  const location = useLocation(); //현재 URL을 가져온다
  const currentUrl = location.pathname; // 가져온 URL 정보에서 pathname 속성값을 가져와 currentUrl 변수에 저장
  //즉, 현재 URL을 currentUrl 변수에 저장하고 있다는 것

  setSubCategory("오늘의 운동");
  return (
    <styled.Container>
      <>
        <div>
          <SubTitle>총 운동시간</SubTitle>
          <ContentsBox height={50}>
            <div>{총운동시간}초</div>
          </ContentsBox>
        </div>
        <div>
          <div style={{ display: "flex", justifyContent: "space-between" }}>
            <styled.DateContainer>{Date}</styled.DateContainer>
            <div>
              <Link to="select" style={{ marginRight: "10px" }}>
                추가
              </Link>
              <Link to="routine">추천 루틴</Link>
            </div>
          </div>
          <styled.ExerciseContainer>
            {buttonAttribute.map(
              (
                element //styled.ExerciseContainer는 buttonAttribute 배열을 map()함수를 사용하여 '반복'하면서 ExerciseButton 컴포넌트를 렌더링
              ) => (
                <ExerciseButton part={element.part} />
              )
            )}
          </styled.ExerciseContainer>
        </div>
      </>
    </styled.Container>
  );
};

export default Today;
