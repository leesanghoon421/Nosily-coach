import * as styled from "./style.js";

const Home = ({ setLargeCategory, setSubCategory }) => {
  setLargeCategory("꼬치코치");
  setSubCategory("홈");

  return (
    <>
      <styled.Container>
        <div>
          <styled.SubTitle>오늘의 목표 달성 정도</styled.SubTitle>
          <styled.GoalBox>내용</styled.GoalBox>
        </div>
        <div>
          <styled.SubTitle>운동 기록</styled.SubTitle>
          <styled.ContentsBox>내용</styled.ContentsBox>
        </div>
        <div>
          <styled.SubTitle>몸 상태</styled.SubTitle>
          <styled.ContentsBox>내용</styled.ContentsBox>
        </div>
        <div>
          <styled.SubTitle>몸무게 감량 예측치</styled.SubTitle>
          <styled.ContentsBox>내용</styled.ContentsBox>
        </div>
      </styled.Container>
    </>
  );
};

export default Home;
