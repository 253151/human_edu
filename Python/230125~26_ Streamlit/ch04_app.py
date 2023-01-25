# -*- coding: utf-8 -*-

import streamlit as st

# Select 기능

def main():
    pLanLists = ['Python', 'Java', 'HTML', 'JS']
    choice = st.selectbox('프로그래밍 언어', pLanLists)
    st.write(f'{choice} 언어를 선택함.')

    # Multiple Selection
    spokenLang = ('영어', '일본어', '중국어', '독일어')
    mylangchoice = st.multiselect('언어 선택', spokenLang, default='영어')
    st.write('선택:', mylangchoice)

    # Slider
    age = st.slider('나이',1,120)
    st.write(age)

    # Select_slider 
    color = st.select_slider('색상 선택', 
        options=['노란색', '빨간색', '파란색', '검정색', '보라색', '흰색'], 
        value = ('노란색', '흰색')
    )
    st.write(color)

if __name__ == "__main__":
    main()