import ContentsBox from "components/ContentsBox";
import * as styled from "./style";

const Select = () => {
  return (
    <styled.Container>
      <ContentsBox axis="row">
        <div>
          <styled.Lable to="/">스쿼트</styled.Lable>
          <styled.Contents>추천 횟수 : M회 N세트</styled.Contents>
          <styled.Contents>종류 : 무산소, 부위 : 다리</styled.Contents>
        </div>
        <styled.AddButton to="/exercise/workset">+</styled.AddButton>
      </ContentsBox>
    </styled.Container>
  );
};

export default Select;
