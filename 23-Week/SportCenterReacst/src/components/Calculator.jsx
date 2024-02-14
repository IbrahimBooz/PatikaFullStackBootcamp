import React, { useState } from 'react';

const Calculator = () => {


    return (
        <>
            <section className="seciton-calculator">
                <div className="calculator-left">
                    <h1>BMI Calculator</h1>
                    <p>
                        Contrary to popular belief, Lorem Ipsum is not simply random text. I has
                        roots in a piece of classical Latin literature from 45 BC, making it over
                        2000 years old.
                        <br /> <br /> Contrary to popular belief, Lorem Ipsum is not simply random
                        text. I has roots in a piece of classical Latin literature from 45 BC,
                        making it over 2000 years old.
                    </p>
                    <div className="calculator-left__input">
                        <input type="text" id="height" placeholder="Your Height (cm)" />
                        <input type="text" id="weight" placeholder="Your Weight (kg)" />
                    </div>
                    <div className="btn-submit">
                        <input
                            type="button"
                            id="btn"
                            onclick="calculateBMI()"
                            defaultValue="Submit"
                            style={{ marginTop: 10 }}
                        />
                        <input
                            type="button"
                            name="reset"
                            id="btn-rest"
                            onclick="resetBMI()"
                            defaultValue="Reset"
                            style={{ marginTop: 10 }}
                        />
                    </div>
                    <span id="result" />
                </div>
                <div className="calculator-right">
                    <h3>Your BMI</h3>
                    <img src="/images/bmi-index.jpg" alt="" />
                    <div className="button-under" />
                </div>
            </section>

        </>
    );
};

export default Calculator;
