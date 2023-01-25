# -*- coding: utf-8 -*-

import streamlit as st

def main():

    name = 'jisu'

    if st.button('Submit'):
        st.write(f'name: {name.upper()}')

    status = st.radio('Status', ('활성화', '비활성화'))

    if status == "활성화" :
        st.success("활성화 상태")
    else:
        st.error('비활성화 상태')

    # 체크박스
    if st.checkbox('Show/Hide'):
        st.text('보이기')

    with st.expander('Python'):
        st.text("Hello Python")
        st.text("Hello Python")
        st.text("Hello Python")
        st.text("Hello Python")


if __name__ == "__main__":
    main()