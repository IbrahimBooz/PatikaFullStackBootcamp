import React, { useState } from 'react';

const Classes = () => {
    const [classInfo, setClassInfo] = useState({
        title: "Why are your Yoga?",
        description: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Repudiandae earum tenetur repellendus facere eius odit iure consequuntur quidem dignissimos nostrum animi illo esse amet laborum atque, facilis nam inventore modi!",
        leftTitle: "When comes Yoga Your Time.",
        schedule: "Saturday-Sunday: 8:00am - 10:00am\nMonday-Tuesday: 10:00am - 12:00am\nWednesday-Friday: 3:00pm - 6:00pm",
        imageSrc: "/images/yoga.jpg"
    });

    const updateContent = (buttonId) => {
        switch (buttonId) {
            case "yoga":
                setClassInfo({
                    title: "Why are your Yoga?",
                    description: "YOGA Lorem ipsum, dolor sit amet consectetur adipisicing elit. Architecto, vel voluptatibus? Repudiandae aut nostrum possimus laudantium ut atque quae",
                    leftTitle: "When comes Yoga Your Time.",
                    schedule: "Saturday-Sunday: 8:00am - 10:00am\nMonday-Tuesday: 10:00am - 12:00am\nWednesday-Friday: 3:00pm - 6:00pm",
                    imageSrc: "/images/yoga.jpg"
                });
                break;

            case "group":
                setClassInfo({
                    title: "Why are your Group?",
                    description: "GROUP Lorem ipsum, dolor sit amet consectetur adipisicing elit. Architecto, vel voluptatibus? Repudiandae aut nostrum possimus laudantium ut atque quae",
                    leftTitle: "When comes Group Your Time.",
                    schedule: "Saturday-Sunday: 8:00am - 10:00am\nMonday-Tuesday: 10:00am - 12:00am\nWednesday-Friday: 3:00pm - 6:00pm",
                    imageSrc: "/images/group.webp"
                });
                break;

            case "solo":
                setClassInfo({
                    title: "Why are your Solo?",
                    description: "SOLO Lorem ipsum, dolor sit amet consectetur adipisicing elit. Architecto, vel voluptatibus? Repudiandae aut nostrum possimus laudantium ut atque quae",
                    leftTitle: "When comes Solo Your Time.",
                    schedule: "Saturday-Sunday: 8:00am - 10:00am\nMonday-Tuesday: 10:00am - 12:00am\nWednesday-Friday: 3:00pm - 6:00pm",
                    imageSrc: "/images/solo.jpg"
                });
                break;

            case "stretching":
                setClassInfo({
                    title: "Why are your Stretching?",
                    description: "Stretching Lorem ipsum, dolor sit amet consectetur adipisicing elit. Architecto, vel voluptatibus? Repudiandae aut nostrum possimus laudantium ut atque quae",
                    leftTitle: "When comes Stretching Your Time.",
                    schedule: "Saturday-Sunday: 8:00am - 10:00am\nMonday-Tuesday: 10:00am - 12:00am\nWednesday-Friday: 3:00pm - 6:00pm",
                    imageSrc: "/images/stret.webp"
                });
                break;

            default:
                break;
        }
    };

    return (
        <section className="section-classes" id="classes">
            <div className="head-up">
                <h1>our classes</h1>
                <span />
                <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Voluptas, veritatis!</p>
            </div>
            <div id="allBtn" className="classes-down">
                <button className="paraf-btn-button paraf-btn-text btn" id="yoga" onClick={() => updateContent("yoga")}>
                    Yoga
                </button>
                <button className="paraf-btn-button paraf-btn-text btn" id="group" onClick={() => updateContent("group")}>
                    Group
                </button>
                <button className="paraf-btn-button paraf-btn-text btn" id="solo" onClick={() => updateContent("solo")}>
                    Solo
                </button>
                <button className="paraf-btn-button paraf-btn-text btn" id="stretching" onClick={() => updateContent("stretching")}>
                    Stretching
                </button>
            </div>
            <div id="classes" className="classes-down-content">
                <div className="classes-left">
                    <h2>{classInfo.title}</h2>
                    <br />
                    <p>{classInfo.description}</p>
                    <br />
                    <br />
                    <h2 className="left-h2">{classInfo.leftTitle}</h2>
                    <br />
                    <p>{classInfo.schedule}</p>
                </div>
                <div className="classes-right">
                    <img src={classInfo.imageSrc} alt="" />
                </div>
            </div>
        </section>
    );
};

export default Classes;
