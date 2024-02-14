const Trainers = () => {
    return (
        <>
            <section className="section-trainers" id="trainer">
                <div className="head-up">
                    <h1>our best trainers</h1>
                    <span />
                    <p>
                        Lorem ipsum dolor, sit amet consectetur adipisicing elit. Voluptas,
                        veritatis!
                    </p>
                </div>
                <div className="card-trainer">
                    <div className="trainer">
                        <div className="trainer-line1" />
                        <div className="trainer-line2" />
                        <img src="/images/trainer1.jpg" alt="" />
                        <div className="trainer-info">
                            <p>Joe Khan</p>
                            <p>Yoga</p>
                        </div>
                    </div>
                    <div className="trainer">
                        <div className="trainer-line1" />
                        <div className="trainer-line2" />
                        <img src="/images/trainer2.jpg" alt="" />
                        <div className="trainer-info">
                            <p>Amartey Elfsa</p>
                            <p>Solo</p>
                        </div>
                    </div>
                    <div className="trainer">
                        <div className="trainer-line1" />
                        <div className="trainer-line2" />
                        <img src="/images/trainer3.jpg" alt="" />
                        <div className="trainer-info">
                            <p>Elissa Kidre</p>
                            <p>Group</p>
                        </div>
                    </div>
                </div>
            </section>

        </>
    )
}

export default Trainers;