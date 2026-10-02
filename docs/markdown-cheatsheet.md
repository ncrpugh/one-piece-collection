Markdown Cheatsheet

Markdown is a simple way of formatting plain-text documents. GitHub automatically renders Markdown into a nicely formatted page.

Headings

Use # characters at the beginning of a line.

# Heading 1

## Heading 2

### Heading 3

#### Heading 4

The more # characters, the smaller the heading.

For most project documents, you will mainly use:

# Document Title

## Main Section

### Subsection
Paragraphs

Just write normal text.

This is a paragraph.

This is another paragraph.

Leave a blank line between paragraphs.

Bold

Put two * characters around the text.

This is **bold text**.

Result:

bold text

You can also use two underscores:

This is __bold text__.
Italic

Put one * around the text.

This is *italic text*.

Result:

italic text

Bold and Italic
This is ***bold and italic***.

Result:

bold and italic

Bullet Lists

Use - at the beginning of each item.

- First item
- Second item
- Third item

Result:

First item
Second item
Third item

You can also use *, but - is commonly used.

Numbered Lists

Use a number followed by a period.

1. First item
2. Second item
3. Third item

Result:

First item
Second item
Third item

Interestingly, Markdown will often automatically number these correctly even if you write:

1. First item
1. Second item
1. Third item
Nested Lists

Indent a list item to put it underneath another item.

- Collection
  - Add cards
  - Remove cards
  - View collection
- Decks
  - Create deck
  - Check collection

Result:

Collection
Add cards
Remove cards
View collection
Decks
Create deck
Check collection
Links

Put the text you want displayed in square brackets, followed by the URL in parentheses.

[GitHub](https://github.com)

Result:

GitHub

Images

Images use a similar format, but start with !.

![Description of image](image-url)

For example:

![Architecture diagram](images/architecture.png)

The text inside the square brackets is alternative text describing the image.

Code

For a small piece of code, use a single backtick.

The application uses `ArrayList` to store jobs.

Result:

The application uses ArrayList to store jobs.

Code Blocks

For multiple lines of code, use three backticks before and after the code.

```java
public void createJob(Job job) {
    listOfJobs.add(job);
}
```

The java after the opening backticks tells GitHub to apply Java syntax highlighting.

Common languages include:

java
javascript
python
html
css
json
sql
powershell
bash

You can also leave the language out:

```
plain text
goes here
```
Blockquotes

Use > at the beginning of a line.

> This is a quoted piece of text.

Result:

This is a quoted piece of text.

You can use this for notes or quotations.

Horizontal Lines

Three hyphens create a horizontal line.

---

Result:

Checkboxes

This is particularly useful for our project backlog.

- [ ] Not completed
- [x] Completed

Result:

Not completed

Completed

You can therefore make a simple task list:

## Current Tasks

- [x] Create repository
- [x] Create documentation structure
- [ ] Define card data
- [ ] Decide how cards are stored
- [ ] Build first prototype
Tables

Tables use | characters.

| Card | Quantity | Owned |
|------|----------|-------|
| OP07-001 | 2 | Yes |
| OP07-002 | 0 | No |
| OP07-003 | 4 | Yes |

GitHub renders this as:

Card	Quantity	Owned
OP07-001	2	Yes
OP07-002	0	No
OP07-003	4	Yes

You can also control alignment:

| Card | Quantity | Price |
|:-----|:--------:|------:|
| OP07-001 | 2 | £5.00 |
| OP07-002 | 4 | £2.50 |
:----- → left aligned
:-----: → centred
-----: → right aligned
Escaping Markdown

Sometimes you want Markdown characters to appear literally rather than being interpreted.

Put a backslash before the character.

\*This will not be italic\*

Result:

*This will not be italic*

Useful Project Structure

Markdown files can also link to other files in your repository.

For example:

See the [project vision](vision.md) for more information.

Or:

See the [feature ideas](features.md).

This is particularly useful as the project grows.