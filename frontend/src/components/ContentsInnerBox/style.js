import styled from "styled-components";

export const ContentsInnerBox = styled.div`
  width: ${props => (props.width ? `${props.width}px` : `90vw`)};
  height: ${props => `${props.height}px`};

  background: #fdfeff;
  box-shadow: inset -2px -2px 4px rgba(0, 0, 0, 0.25),
    inset 2px 2px 4px rgba(0, 0, 0, 0.25);
  border-radius: 16px;
`;

export const InnerBox = styled.div`
  display: flex;
  flex-direction: ${props => props.axis};
  gap: 10px;

  padding: 15px;
`;
