import * as styled from "./style";

const ContentsBox = ({ children, height }) => {
  return (
    <>
      <styled.ContentsBox height={height}>{children}</styled.ContentsBox>
    </>
  );
};

export default ContentsBox;
