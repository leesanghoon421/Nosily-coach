import * as styled from "./style.js";

const TopBar = ({ largeCategory, subCategory }) => {
  return (
    <>
      <styled.Container>
        <styled.LargeCategory>{largeCategory}</styled.LargeCategory>
        <styled.Subcategory>{subCategory}</styled.Subcategory>
      </styled.Container>
    </>
  );
};

export default TopBar;
