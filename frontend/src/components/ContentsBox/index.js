import * as styled from "./style";

const ContentsBox = ({ children, height, axis }) => {
  if (!!axis === false) axis = "column";
  return (
    <>
      <styled.ContentsBox height={height}>
        <styled.InnerBox axis={axis}>{children}</styled.InnerBox>
      </styled.ContentsBox>
    </>
  );
};

export default ContentsBox;
