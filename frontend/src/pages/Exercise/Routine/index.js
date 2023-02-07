import { useState } from "react"; // react의 useState 함수 사용
import { Link, useLocation, Outlet } from "react-router-dom"; // react-router-dom의 useLocation, Outlet 함수 사용

import * as styled from "./style"; // styled.js 파일에서 정의한 스타일들 가져오기
import SubTitle from "components/SubTitle";
import RoutineBox from "components/RoutineBox";

const parts = ["가볍게 즐기는 유산소 루틴", "상체 1시간 불태우기"];

const Routine = ({ setSubCategory }) => {
  const [Date, SetDate] = useState("2023/2/7");
  const location = useLocation(); //현재 URL을 가져온다
  const currentUrl = location.pathname;

  setSubCategory("추천 운동 루틴");

  return (
    <styled.Container>
      {currentUrl !== "/exercise/routine" ? (
        <Outlet />
      ) : (
        <div>
          <SubTitle>추천 루틴 목록</SubTitle>
          <styled.RoutineContainer>
            {parts.map(element => (
              <styled.BoxContents to="/exercise/info">
                <img src="img/icon.png" alt="icon" />
                {element}
              </styled.BoxContents>
            ))}
          </styled.RoutineContainer>
        </div>
      )}
    </styled.Container>
  );
};

export default Routine;
