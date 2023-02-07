import * as styled from "./style";

const ContentsInnerBox = ({ children, width, height, axis }) => {
  if (!!axis === false) axis = "column";
  return (
    <styled.ContentsInnerBox width={width} height={height}>
      <styled.InnerBox axis={axis}>{children}</styled.InnerBox>
    </styled.ContentsInnerBox>
  );
};

export default ContentsInnerBox;
