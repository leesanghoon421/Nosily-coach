import DietCalendar from "components/DietCalendar";
import MealRecord from "components/MealRecord";
//import Timer from "../../components/Timer";

const Dietetics = ({ setLargeCategory, setSubCategory }) => {
  setLargeCategory("식단 관리");
  setSubCategory("식단");
  return (
    <>
        <DietCalendar setSubCategory={setSubCategory} />
        {/*<MealRecord />*/}
        {/* <Timer/> */}
    </>
  );
};

export default Dietetics;
