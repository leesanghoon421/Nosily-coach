import SubTitle from "components/SubTitle/index.js";
import * as styled from "./style.js";

const Home = ({ setLargeCategory, setSubCategory }) => {
  setLargeCategory("꼬치코치");
  setSubCategory("홈");

  return (
    <>
      <styled.Container>
        <div>
          <SubTitle>오늘의 목표 달성 정도</SubTitle>
          <styled.GoalBox>내용</styled.GoalBox>
        </div>
        <div>
          <SubTitle>운동 기록</SubTitle>
          <styled.ContentsBox>내용</styled.ContentsBox>
        </div>
        <div>
          <SubTitle>몸 상태</SubTitle>
          <styled.ContentsBox>내용</styled.ContentsBox>
        </div>
        <div>
          <SubTitle>몸무게 감량 예측치</SubTitle>
          <styled.ContentsBox>내용</styled.ContentsBox>
        </div>
      </styled.Container>
    </>
  );
};

export default Home;
