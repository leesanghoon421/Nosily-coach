import * as styled from "./style";

const ContentsBox = ({ children, height }) => {
  return (
    <>
      <styled.ContentsBox height={height}>
        <styled.InnerBox>{children}</styled.InnerBox>
      </styled.ContentsBox>
    </>
  );
};

export default ContentsBox;
