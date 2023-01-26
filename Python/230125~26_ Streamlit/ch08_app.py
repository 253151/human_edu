# -*- coding: utf-8 -*-

import streamlit as st 
import time 

def make_grids(cols, rows):
    grid = [0] * cols 
    for i in range(cols):
        with st.container():
            grid[i] = st.columns(rows)
    return grid 

def main():
    my_grid = make_grids(2, 3)
    with my_grid[0][0]:
        st.header('Progress bar')
        st.write('url : https://docs.streamlit.io/library/api-reference/status/st.progress')
        my_bar = st.progress(0)
        for percent in range(3):
            time.sleep(0.1)
            my_bar.progress(percent + 1)
    
    with my_grid[0][1]:
        st.header('Spinner')
        st.write('url : https://docs.streamlit.io/library/api-reference/status/st.spinner')
        for i in range(0, 3):
            with st.spinner('Wait for it... **%s seconds**' % (3-i)):
                time.sleep(1)
        st.success('Done!')

    with my_grid[0][2]:
        st.header('Balloons')
        st.write('url : https://docs.streamlit.io/library/api-reference/status/st.balloons')
        st.balloons()

    with my_grid[1][0]:
        st.header('Snowflakes')
        st.write('url : https://docs.streamlit.io/library/api-reference/status/st.snow')
        st.snow()

    with my_grid[1][1]:
        # Colored Text
        st.success("성공")
        st.warning("경고")
        st.info("정보")
        st.error("에러", icon="🙏")
        
    with my_grid[1][2]:
        st.header('Exception')
        st.write('url : https://docs.streamlit.io/library/api-reference/status/st.exception')
        a = 1
        b = 0
        try:
            a/b 
        except:
            st.exception(ZeroDivisionError('Division By Zero'))
        

if __name__ == "__main__":
    main()