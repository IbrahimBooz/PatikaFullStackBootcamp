import React, { useEffect, useState } from 'react';

const Header = () => {
    const [showMenu, setShowMenu] = useState(false);

    const toggleMenu = () => {
        setShowMenu(prevState => !prevState);
    };

    useEffect(() => {
        const handleScroll = () => {
            const navbar = document.querySelector('.menu');

            if (window.scrollY > 0) {
                navbar.classList.add('navbar-scrolled');
            } else {
                navbar.classList.remove('navbar-scrolled');
            }
        };

        window.addEventListener('scroll', handleScroll);

        return () => {
            window.removeEventListener('scroll', handleScroll);
        };
    }, []);

    useEffect(() => {
        const handleClickOutsideMenu = (event) => {
            const menuButton = document.querySelector('.hamburger-menu');
            const isMenuButton = event.target === menuButton;
            const isMenuContainer = document.querySelector('.nav-right.show-menu');
            const isClickInsideMenuContainer = isMenuContainer && isMenuContainer.contains(event.target);

            if (!isMenuButton && !isClickInsideMenuContainer) {
                setShowMenu(false);
            }
        };

        document.addEventListener('click', handleClickOutsideMenu);

        return () => {
            document.removeEventListener('click', handleClickOutsideMenu);
        };
    }, []);

    return (
        <>
            <section className="hero-section">
                {/* images container */}
                <div className="container">
                    {/* navbar-section */}
                    <div className="menu">
                        <div className="nav-left">
                            <img src="/images/logo.png" alt="" />
                        </div>
                        <div className="nav-right">
                            <a className="nav-right-a" href="#home">
                                Home
                            </a>
                            <a className="nav-right-a" href="#classes">
                                Classes
                            </a>
                            <a className="nav-right-a" href="#trainer">
                                Trainer
                            </a>
                            <a className="nav-right-a" href="#review">
                                Review
                            </a>
                            <a className="nav-right-a" href="#contact">
                                Contact
                            </a>
                            <button className="join-us-button">
                                <a className="nav-right-a" target="_blank" href="#joinUs">
                                    JOIN US
                                </a>
                            </button>
                        </div>
                        <div className="hamburger-menu">
                            <div className="bar" />
                            <div className="bar" />
                            <div className="bar" />
                        </div>
                    </div>
                    {/* content-section */}
                    <div className="section-content" id="home">
                        <div>
                            <button className="content__powerfull-button">
                                <a href="">POWERFULL</a>
                            </button>
                        </div>
                        <div>
                            <p className="paraf">
                                Group <br /> Practice <br /> With Trainer
                            </p>
                            <p className="content__paraf-content">
                                Lorem, ipsum dolor sit amet consectetur adipisicing elit. Porro
                                sapiente mollitia nobis totam, at placeat aliquid autem nihil!
                                Perspiciatis voluptas tempora officia vitae doloribus est, quisquam
                                fugit?
                            </p>
                        </div>
                        <div className="paraf-btn">
                            <button className="paraf-btn-button">
                                <a className="paraf-btn-text" href="#">
                                    Sign Up
                                </a>
                            </button>
                            <button className="paraf-btn-border">
                                <a className="paraf-btn-border-text" href="#">
                                    Sign Up
                                </a>
                            </button>
                        </div>
                    </div>
                </div>
                {/* card-section */}
                <div className="section-carosel">
                    <div className="card">
                        <h1>325</h1>
                        <h2>Course</h2>
                    </div>
                    <div className="card">
                        <h1>405</h1>
                        <h2>Work Out</h2>
                    </div>
                    <div className="card">
                        <h1>305</h1>
                        <h2>Working Hour</h2>
                    </div>
                    <div className="card">
                        <h1>705</h1>
                        <h2>Happy Client</h2>
                    </div>
                </div>
            </section>
        </>
    );
};

const Classes = () => {
    // Classes bileşeni içeriği
    return (
        <section className="section-classes" id="classes">
            <div className="head-up">
                <h1>our classes</h1>
                <span />
                <p>
                    Lorem ipsum dolor, sit amet consectetur adipisicing elit. Voluptas,
                    veritatis!
                </p>
            </div>
            <div id="allBtn" className="classes-down">
                <button className="paraf-btn-button paraf-btn-text btn" id="yoga">
                    Yoga
                </button>
                <button className="paraf-btn-button paraf-btn-text btn" id="group">
                    Group
                </button>
                <button className="paraf-btn-button paraf-btn-text btn" id="solo">
                    Solo
                </button>
                <button className="paraf-btn-button paraf-btn-text btn" id="stretching">
                    Stretching
                </button>
            </div>
            <div id="classes" className="classes-down-content">
                <div className="classes-left">
                    <h2>Why are your Yoga?</h2>
                    <br />
                    <p>
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Repudiandae
                        earum tenetur repellendus facere eius odit iure consequuntur quidem
                        dignissimos nostrum animi illo esse amet laborum atque, facilis nam
                        inventore modi!
                    </p>
                    <br />
                    <br />
                    <h2 className="left-h2">When comes Yoga Your Time.</h2>
                    <br />
                    <p>
                        Saturday-Sunday:8:00am - 10:00am <br />
                        <br />
                        Monday-Tuesday:10:00am - 12:00am <br />
                        <br />
                        Wednesday-Friday:3:00pm - 6:00pm
                    </p>
                </div>
                <div className="classes-right">
                    <img src="/images/yoga.jpg" alt="" />
                </div>
            </div>
        </section>

    );
};

export default Header;
