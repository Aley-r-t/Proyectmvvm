package com.pruebas.rodrigo.proyectmvvm.data.model

class QuoteProvider {
    companion object {
        fun random(): QuoteModel {
            val position = (0 until quote.size).random()
            return quote[position]
        }
    private val quote = listOf<QuoteModel>(
        QuoteModel("The best way to get started is to quit talking and begin doing.", "Walt Disney"),
        QuoteModel("The pessimist sees difficulty in every opportunity. The optimist sees opportunity in every difficulty.", "Winston Churchill"),
        QuoteModel("Don’t let yesterday take up too much of today.", "Will Rogers"),
        QuoteModel("You learn more from failure than from success. Don’t let it stop you. Failure builds character.", "Unknown"),
        QuoteModel("It’s not whether you get knocked down, it’s whether you get up.", "Vince Lombardi"),
        QuoteModel("If you are working on something that you really care about, you don’t have to be pushed. The vision pulls you.", "Steve Jobs"),
        QuoteModel("People who are crazy enough to think they can change the world, are the ones who do.", "Rob Siltanen"),
        QuoteModel("Failure will never overtake me if my determination to succeed is strong enough.", "Og Mandino"),
        QuoteModel("Entrepreneurs are great at dealing with uncertainty and also very good at minimizing risk. That’s the classic entrepreneur.", "Mohnish Pabrai"),
        QuoteModel("We may encounter many defeats but we must not be defeated.", "Maya Angelou"),
        QuoteModel("Knowing is not enough; we must apply. Wishing is not enough; we must do.", "Johann Wolfgang Von Goethe"),
        QuoteModel("Imagine your life is perfect in every respect; what would it look like?", "Brian Tracy"),
        QuoteModel("We generate fears while we sit. We overcome them by action.", "Dr. Henry Link"),
        QuoteModel("Whether you think you can or think you can’t, you’re right.", "Henry Ford"),
        QuoteModel("Security is mostly a superstition. Life is either a daring adventure or nothing.", "Helen Keller"),
        QuoteModel("The only limit to our realization of tomorrow will be our doubts of today.", "Franklin D. Roosevelt"),
        QuoteModel("Creativity is intelligence having fun.", "Albert Einstein"),
        QuoteModel("What you lack in talent can be made up with desire, hustle and giving 110% all the time.", "Don Zimmer"),
        QuoteModel("Do what you can with all you have, wherever you are.", "Theodore Roosevelt"),
        QuoteModel("Develop an ‘Attitude of Gratitude’. Say thank you to everyone you meet for everything they do for you.", "Brian Tracy"),
        QuoteModel("You are never too old to set another goal or to dream a new dream.", "C.S. Lewis"),
        QuoteModel("To see what is right and not do it is a lack of courage.", "Confucius"),
        QuoteModel("Reading is to the mind, as exercise is to the body.", "Brian Tracy"),
        QuoteModel("Fake it until you make it! Act as if you had all the confidence you require until it becomes your reality.", "Brian Tracy"),
        QuoteModel("The future belongs to the competent. Get good, get better, be the best!", "Brian Tracy"),
        QuoteModel("For every reason it’s not possible, there are hundreds of people who have faced the same circumstances and succeeded.", "Jack Canfield"),
    )
    }
}