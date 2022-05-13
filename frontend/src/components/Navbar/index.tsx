import { ReactComponent as GithubIcom } from '../../assets/img/github.svg';
import './styles.css';

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/yujiyamamoto64" >
                        <div className="dsmovie-contact-container">
                            <GithubIcom />
                            <p className="dsmovie-contact-link">/yujiyamamoto64</p>
                        </div>

                    </a>
                </div>
            </nav>
        </header>
    )
}

export default Navbar;