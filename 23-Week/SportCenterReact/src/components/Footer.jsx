const Footer = () => {
    return (
        <footer className="footer">
            <div className="footer-up">
                <img src="/images/logo.png" alt="" />
                <p>
                    Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quaerat a
                    aliquam unde quis dignissimos id sunt quam autem voluptas doloribus
                    excepturi tempora error cum repellendus soluta voluptates, reprehenderit,
                    sequi illum.
                </p>
            </div>
            <div className="footer-down">
                <div className="footer-down-left">
                    <ul>
                        <li>
                            <a href="#">Information</a>
                        </li>
                        <li>
                            <a href="#">About Us</a>
                        </li>
                        <li>
                            <a href="#">Classes</a>
                        </li>
                        <li>
                            <a href="#">Blog</a>
                        </li>
                        <li>
                            <a href="#">Contact</a>
                        </li>
                    </ul>
                </div>
                <div className="footer-down-right">
                    <ul>
                        <li>
                            <a href="#">Helpful Links</a>
                        </li>
                        <li>
                            <a href="#">Services</a>
                        </li>
                        <li>
                            <a href="#">Supports</a>
                        </li>
                        <li>
                            <a href="#">Terms &amp; Condition</a>
                        </li>
                        <li>
                            <a href="#">Privacy Policy</a>
                        </li>
                    </ul>
                </div>
            </div>
        </footer>

    )
}

export default Footer;