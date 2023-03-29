import React from 'react';
import '../../scss/main_style.scss';

export default function MainComponent  ({스타벅스}) {

    const gread = 스타벅스.map((item, idx)=>{
        return(
            <tr key={item.번호}>
                <td>{item.번호}</td>
                <td>{item.제목}</td>
                <td>{item.날짜}</td>
                <td>{item.조회수}</td>
            </tr>
            )

    })
    React.useEffect(()=>{
        
    })
    return (
        <div id='main'>
            <section id="section">
                <div className="container">
                    <div className="gap">
                        <div className="title">
                            <h2>공지사항</h2>
                        </div>
                        <div className="content">
                            <table>
                                <thead>
                                    <tr>
                                        <th>No</th>
                                        <th>제목</th>
                                        <th>날짜</th>
                                        <th>조회수</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    {
                                        gread
                                            
                                    }
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    );
};

