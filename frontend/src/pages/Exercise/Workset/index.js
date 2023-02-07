import { useState } from "react";
import * as styled from "./style.js";
import { Link } from "react-router-dom";

import { useLocation, Outlet } from "react-router-dom"; // react-router-dom의 useLocation, Outlet 함수 사용
import ContentsInnerBox from "components/ContentsInnerBox";
import ContentsBox from "components/ContentsBox";
import SubTitle from "components/SubTitle";

const Workset = () => {
  const [운동명, set운동명] = useState("레그프레스");
  const [운동진행시간, set운동진행시간] = useState("00:10:30");
  const [운동진행횟수, set운동진행횟수] = useState("3");
  const [세트, set세트] = useState("3");

  return (
    <>
      <styled.Container>
        <styled.Container>
          <SubTitle>운동명</SubTitle>
          <ContentsInnerBox height={50}>
            <div style={{ textAlign: "center" }}>{운동명}</div>
          </ContentsInnerBox>
        </styled.Container>
        <styled.Container>
          <SubTitle>운동 진행 시간</SubTitle>
          <ContentsInnerBox height={50}>
            <div style={{ textAlign: "center" }}>{운동진행시간}</div>
          </ContentsInnerBox>
        </styled.Container>
        <styled.Container>
          <SubTitle>운동 진행 횟수</SubTitle>
          <styled.RowContainer>
            <ContentsInnerBox width={100} height={50}>
              <div style={{ textAlign: "center" }}>{운동진행횟수}</div>
            </ContentsInnerBox>
            <div>번씩</div>
            <ContentsInnerBox width={100} height={50}>
              <div style={{ textAlign: "center" }}>{세트}</div>
            </ContentsInnerBox>
            <div>세트</div>
          </styled.RowContainer>
        </styled.Container>
      </styled.Container>
    </>
  );
};

export default Workset;
