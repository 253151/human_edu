# -*- coding: utf-8 -*-
# 라이브러리 불러오기
import streamlit as st

# 기타 사용자 정의 함수를 정의

# main()
def main():

    # title
    st.title('Hello World@')
    
    # Header
    st.header('This is header.')

    # subheader
    st.subheader('This is sub header.')

    # markdown
    st.markdown('# This is heading1.')
    st.markdown('## This is heading2.')
    st.markdown('### This is heading3.')

    # Colored Text
    st.success("성공")
    st.warning("경고")
    st.info("정보")
    st.error("에러")
    st.exception("예외처리")

    # Superfunction
    st.write('텍스트')
    st.write(2)
    st.write(2+5)
    st.write(dir(str))

if __name__ == "__main__":
    main()