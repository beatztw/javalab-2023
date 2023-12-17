package repository

import "SimpleWebProject/internal/model"

type UserRepository struct {
}

func NewUserRepository() *UserRepository {
	return &UserRepository{}
}

func (repo *UserRepository) GetAll() (users []*model.User) {

	users = []*model.User{
		{
			ID:        1,
			FirstName: "Alex",
			LastName:  "Chugunov",
		}, {
			ID:        2,
			FirstName: "Penal",
			LastName:  "Gilyaziev",
		}, {
			ID:        3,
			FirstName: "Zinnur",
			LastName:  "Zagidullin",
		},
	}

	return
}
