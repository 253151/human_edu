# -*- coding: utf-8 -*-

import streamlit as st
import pandas as pd


def main():
    data = pd.read_csv('data/iris.csv')
    st.title('데이터 확인')
    st.dataframe(data, 400, 200)

    # 색상 입히기
    st.title("Adding Color")
    st.dataframe(data.style.highlight_max(axis=0))

    # table() 활용
    st.title('table() 함수 활용')
    st.table(data.head())

    # 샘플 코드 보여주기
    mycode = """
    def hello():
        print("Hello World@@")
    """
    st.code(mycode, language='python')
    

if __name__ == "__main__":
    main()