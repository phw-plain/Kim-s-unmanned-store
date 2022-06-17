import React, { useState } from 'react';
import Slider from "react-slick";
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";

export const CategorySlider = ({ getText }) => {
  const [select, setSelect] = useState(null);
  const [category, setCategory] = useState([ "과자", "사탕", "음료", "젤리", "냉장", "과일", "채소" ]);

  const settings = {
    dots: false,
    infinite: true,
    speed: 500,
    slidesToShow: 4,
    slidesToScroll: 1
  };

  const btnClick = (idx) => {
    if(select !== null && select !== idx) {
      document.getElementById(select).classList.remove('category_over')
      setSelect(idx)
      getText(category[idx]);
      document.getElementById(idx).classList.add('category_over')
    } else if(category[select] !== document.getElementById(idx).value) {
      setSelect(idx)
      getText(category[idx]);
      document.getElementById(idx).classList.add('category_over')
    } else {
      setSelect(null)
      getText("");
      document.getElementById(idx).classList.remove('category_over')
    }
    console.log(document.getElementById(idx).value)
  }

  return (
    <div style={{marginTop:"1.5%", display:"inline-block", width:"37vh"}}>
      <Slider {...settings}>
        <div>
            <button id="0" className='category 0' value={category[0]} onClick={ () => btnClick(0)}>
              {category[0]}</button>
        </div>
        <div>
            <button id="1" className='category 1' value={category[1]} onClick={ () => btnClick(1)}>
              {category[1]}</button>
        </div>
        <div>
            <button id="2" className='category 2' value={category[2]} onClick={ () => btnClick(2)}>
              {category[2]}</button>
        </div>
        <div>
            <button id="3" className='category 3' value={category[3]} onClick={ () => btnClick(3)}>
              {category[3]}</button>
        </div>
        <div>
            <button id="4" className='category 4' value={category[4]} onClick={ () => btnClick(4)}>
              {category[4]}</button>
        </div>
        <div>
            <button id="5" className='category 5'  value={category[5]} onClick={ () => btnClick(5)}>
              {category[5]}</button>
        </div><div>
            <button id="6" className='category 6' value={category[6]} onClick={ () => btnClick(6)}>
              {category[6]}</button>
        </div>
      </Slider>
    </div>
  );
}