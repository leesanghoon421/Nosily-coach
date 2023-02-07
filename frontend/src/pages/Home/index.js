import SubTitle from "components/SubTitle";
import ContentsBox from "components/ContentsBox";
import * as styled from "./style.js";

const Home = ({ setLargeCategory, setSubCategory }) => {
  setLargeCategory("꼬치코치");
  setSubCategory("홈");

  return (
    <>
      <styled.Container>
        <div>
          <SubTitle>오늘의 목표 달성 정도</SubTitle>
          <ContentsBox height={130}>내용</ContentsBox>
        </div>
        <div>
          <SubTitle>운동 기록</SubTitle>
          <ContentsBox height={60}>내용</ContentsBox>
        </div>
        <div>
          <SubTitle>몸 상태</SubTitle>
          <ContentsBox height={60}>내용</ContentsBox>
        </div>
        <div>
          <SubTitle>몸무게 감량 예측치</SubTitle>
          <ContentsBox height={60}>내용</ContentsBox>
        </div>
      </styled.Container>
    </>
  );
};

export default Home;
