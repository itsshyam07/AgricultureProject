import React from 'react';
import Slider from 'react-slick';
import 'slick-carousel/slick/slick.css';
import 'slick-carousel/slick/slick-theme.css';
import { Container, Row, Col } from 'react-bootstrap';
import testmonial from "./Testimonial.css";
const Testimonial = () => {
  const testimonials = [
    {
      img: 'https://www.tutorialrepublic.com/examples/images/clients/1.jpg',
      text:
      'I am incredibly impressed with the agricultural website. It has become an invaluable resource for me and my farming business. The platform provides up-to-date information on market trends, crop management techniques, and best practices. The website has truly revolutionized the way I approach agriculture.',
      name: 'Niraja Sharma',
      designation: 'Farm Enthusiast',
    },
    {
      img: 'https://www.tutorialrepublic.com/examples/images/clients/2.jpg',
      text:
      'As a new farmer, I was looking for guidance and support in the agricultural industry. This website has been a game-changer for me. It offers a wealth of educational resources, including articles, tutorials, and videos, covering a wide range of topics. I highly recommend this website to anyone involved in agriculture.',
      name: 'Vikas Patil',
      designation: 'Farm Owner',
    },
    {
      img: 'https://www.tutorialrepublic.com/examples/images/clients/3.jpg',
      text:
      'I cannot recommend this agricultural website enough. It has been an invaluable resource for connecting with fellow farmers and industry experts. The networking opportunities and knowledge exchange have been instrumental in my personal and professional growth. The website has created a supportive.',
      name: 'Sarah Thompson',
      name: 'Suraj Rathod',
      designation:'Aspiring Farmer',
    },
  ];

  const PreviousBtn = (props) => {
    const { className, onClick } = props;
    return (
      <div className={className} onClick={onClick}>
        <i className="fas fa-chevron-left fa-2x" style={{ color: 'gray' }}></i>
      </div>
    );
  };

  const NextBtn = (props) => {
    const { className, onClick } = props;
    return (
      <div className={className} onClick={onClick}>
        <i className="fas fa-chevron-right fa-2x" style={{ color: 'gray' }}></i>
      </div>
    );
  };

  return (
    <div className="testimonial">
      <Container>
        <h1 className="text-center mb-5">TESTIMONIALS</h1>
        <Slider dots prevArrow={<PreviousBtn />} nextArrow={<NextBtn />}>
          {testimonials.map((testimonial, index) => (
            <Card key={index} {...testimonial} />
          ))}
        </Slider>
      </Container>
    </div>
  );
};

const Card = ({ img, text, name, designation }) => {
  return (
    <div className="testimonial-card">
      <Row className="justify-content-center">
        <Col xs={12} md={6} lg={4} className="text-justify">
          <img src={img} alt="avatar" className="testimonial-avatar" />
          <p>{text}</p>
          <p>
            <strong>{name}</strong>, {designation}
          </p>
        </Col>
      </Row>
    </div>
  );
};

export default Testimonial;
