import * as styled from "./style.js";

const TopBar = ({ largeCategory, subCategory }) => {
  return (
    <>
      <styled.Container>
        <styled.LargeCategory>{largeCategory}</styled.LargeCategory>
        <styled.SubCategory>{subCategory}</styled.SubCategory>
      </styled.Container>
    </>
  );
};

export default TopBar;
