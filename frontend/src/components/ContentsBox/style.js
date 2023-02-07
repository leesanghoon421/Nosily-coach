import styled from "styled-components";

export const ContentsBox = styled.div`
  width: 90vw;
  height: ${(props) => `${props.height}px`};

  margin-top: 8px;

  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 10px;
`;
