const Contact = () => {
    return (
        <>

            <section className="section-contact" id="contact">
                <div className="head-up">
                    <h1>contact us</h1>
                    <span />
                    <p>
                        Lorem ipsum dolor, sit amet consectetur adipisicing elit. Voluptas,
                        veritatis!
                    </p>
                </div>
                <div className="contact">
                    <div className="contact-left">
                        <div className="contact-left-info">
                            <p>Mobil Number</p>
                            <p>+125 442 23 45</p>
                            <p>Email Address</p>
                            <p>demo@demo.com</p>
                        </div>
                        <div className="form">
                            <h2>Make An Appoinment</h2>
                            <input type="text" placeholder="Your Name" required="" />
                            <input type="text" placeholder="Your Email" required="" />
                            <textarea
                                id=""
                                name=""
                                rows={50}
                                cols={70}
                                placeholder="Describe yourself here..."
                                defaultValue={" "}
                            />
                        </div>
                    </div>
                    <div className="contact-right" id="map">
                        <iframe
                            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3059.8477023886567!2d32.8573318!3d39.922424299999996!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x14d34e54f0e6d8eb%3A0xd999b9886e716100!2sSakarya%20Cd.%2C%20%C3%87ankaya%2FAnkara!5e0!3m2!1str!2str!4v1706681054860!5m2!1str!2str"
                            width={500}
                            height={350}
                            style={{ border: 0, display: "block" }}
                            allowFullScreen=""
                            loading="lazy"
                            referrerPolicy="no-referrer-when-downgrade"
                        />
                    </div>
                </div>
            </section>


        </>
    )
}
export default Contact;