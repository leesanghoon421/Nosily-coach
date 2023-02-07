import { useState } from "react";
import * as styled from "./style.js";
import { Link } from "react-router-dom";

import { useLocation, Outlet } from "react-router-dom"; // react-router-dom의 useLocation, Outlet 함수 사용
import ContentsBox from "components/ContentsBox";
import SubTitle from "components/SubTitle";

const Workset = () => {
  const [운동명, set운동명] = useState("레그프레스");
  const [운동진행시간, set운동진행시간] = useState("00:10:30");
  const [운동진행횟수, set운동진행횟수] = useState("3번씩3세트");
  return (
    <>
      <styled.Container>
        <styled.Container>
          <SubTitle>운동명</SubTitle>
          <ContentsBox height={60}>
            <div style={{ textAlign: "center" }}>{운동명}</div>
          </ContentsBox>
        </styled.Container>
        <styled.Container>
          <SubTitle>운동 진행 시간</SubTitle>
          <ContentsBox height={60}>
            <div style={{ textAlign: "center" }}>{운동진행시간}</div>
          </ContentsBox>
        </styled.Container>
        <styled.Container>
          <SubTitle>운동 진행 횟수</SubTitle>
          <styled.RowContainer>
            <ContentsBox width={1} height={60}>
              <div style={{ textAlign: "center" }}>{운동진행횟수}</div>
            </ContentsBox>
            <ContentsBox width={1} height={60}>
              <div style={{ textAlign: "center" }}>{운동진행횟수}</div>
            </ContentsBox>
          </styled.RowContainer>
        </styled.Container>
      </styled.Container>
    </>
  );
};

export default Workset;
