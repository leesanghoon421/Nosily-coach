import SubTitle from "components/SubTitle";
import RoutineBox from "components/RoutineBox";

import * as styled from "./style";

const parts = ["스쿼트", "레그 프레스", "런지", "풀업"];

const RoutineInfo = ({ setSubCategory }) => {
  setSubCategory("루틴 세부 정보");
  return (
    <>
      <div>
        <SubTitle>루틴 명</SubTitle>
        <styled.RoutineContainer>
          {parts.map(element => (
            <RoutineBox part={element} />
          ))}
        </styled.RoutineContainer>
      </div>
    </>
  );
};

export default RoutineInfo;
