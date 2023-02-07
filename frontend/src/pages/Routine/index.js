import { useState } from "react"; // react의 useState 함수 사용
import * as styled from "./style.js"; // styled.js 파일에서 정의한 스타일들 가져오기
import { useLocation, Outlet } from "react-router-dom"; // react-router-dom의 useLocation, Outlet 함수 사용
import RoutineBox from "components/RoutineBox";

const Routine = () => {
    

  return (
    <>
      <styled.Pointblock>
        <h2>운동 루틴</h2>
      </styled.Pointblock>

      <styled.DateContainer>

        <div>운동일 지정</div>

      </styled.DateContainer>

      <styled.RoutineContainer>
          <RoutineBox/>
          <RoutineBox/>
          <RoutineBox/>
          <RoutineBox/>
      </styled.RoutineContainer>
    </>
  );
};

export default Routine;
