import { useState } from "react";
import * as styled from "./style";

const RoutineBox = ({ part }) => {
  const [반복횟수, set반복횟수] = useState(0);
  const [세트개수, set세트개수] = useState(0);

  return (
    <styled.RoutineBox>
      <div>{part}</div>
      <styled.ReferralCount>
        추천 횟수 : {반복횟수}회 {세트개수}세트
      </styled.ReferralCount>
    </styled.RoutineBox>
  );
};
export default RoutineBox;
