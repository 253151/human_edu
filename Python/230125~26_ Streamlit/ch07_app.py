# -*- coding: utf-8 -*-

import streamlit as st 
import numpy as np 


def main():
    # container 
    np.random.seed(seed=42)

    c1, c2 = st.columns([1, 1])
    show_p1 = c1.checkbox('Table 1', True)
    show_p2 = c2.checkbox('Table 2', True)

    panel1 = c1.empty()
    panel2 = c2.empty()

    data01 = np.random.randn(10, 3)
    data02 = np.random.randn(10, 3)

    if show_p1:
        with panel1.container():
            st.bar_chart(data01)
    else:
        c1.write(data01)
        panel1 = st.empty()

    if show_p2:
        with panel2.container():
            st.bar_chart(data02)
    else:
        c2.write(data02)
        panel2 = st.empty()

if __name__ == "__main__":
    main()