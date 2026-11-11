.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;
.super Landroidx/recyclerview/widget/RecyclerView$びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ$げつ〴ぬぐ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$\u3073\u3050\u3073\u3042\u3073<",
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u303b\u305e\u307e\u304e\u306a\u303b/\u3078\u306c\u3034\u3065\u305e$\u3052\u3064\u3034\u306c\u3050;",
        ">;"
    }
.end annotation


# instance fields
.field public final くし〴〺ぅ:Lcom/google/android/material/datepicker/CalendarConstraints;

.field public final づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび$なぎぱいぢぎ;

.field public final なぎぱいぢぎ:I

.field public final びぐびあび:Lcom/google/android/material/datepicker/DateSelector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/datepicker/DateSelector<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/material/datepicker/DateSelector;Lcom/google/android/material/datepicker/CalendarConstraints;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび$なぎぱいぢぎ;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/material/datepicker/DateSelector<",
            "*>;",
            "Lcom/google/android/material/datepicker/CalendarConstraints;",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d/\u303b\u305e\u307e\u304e\u306a\u303b/\u3073\u3050\u3073\u3042\u3073$\u306a\u304e\u3071\u3044\u3062\u304e;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;-><init>()V

    .line 1
    iget-object v0, p3, Lcom/google/android/material/datepicker/CalendarConstraints;->〺つふすそ:Lcom/google/android/material/datepicker/Month;

    .line 2
    iget-object v1, p3, Lcom/google/android/material/datepicker/CalendarConstraints;->くし〴〺ぅ:Lcom/google/android/material/datepicker/Month;

    .line 3
    iget-object v2, p3, Lcom/google/android/material/datepicker/CalendarConstraints;->びぐびあび:Lcom/google/android/material/datepicker/Month;

    .line 4
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/Month;->なぎぱいぢぎ(Lcom/google/android/material/datepicker/Month;)I

    move-result v0

    if-gtz v0, :cond_5a

    invoke-virtual {v2, v1}, Lcom/google/android/material/datepicker/Month;->なぎぱいぢぎ(Lcom/google/android/material/datepicker/Month;)I

    move-result v0

    if-gtz v0, :cond_52

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/てぜきぽく;->なぎぱいぢぎ:I

    .line 5
    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;->な〱ちぉじ:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->mtrl_calendar_day_height:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    mul-int v0, v0, v1

    .line 6
    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/ぺふねづ〺;->へえどぜせ(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_34

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    goto :goto_35

    :cond_34
    const/4 p1, 0x0

    :goto_35
    add-int/2addr v0, p1

    .line 8
    iput v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;->なぎぱいぢぎ:I

    iput-object p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;->くし〴〺ぅ:Lcom/google/android/material/datepicker/CalendarConstraints;

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;->びぐびあび:Lcom/google/android/material/datepicker/DateSelector;

    iput-object p4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび$なぎぱいぢぎ;

    const/4 p1, 0x1

    .line 9
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$づざかべべ;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$づざかべべ;->げつ〴ぬぐ()Z

    move-result p2

    if-nez p2, :cond_4a

    .line 10
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->〺つふすそ:Z

    return-void

    :cond_4a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot change whether this adapter has stable IDs while the adapter has registered observers."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_52
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "currentPage cannot be after lastPage"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "firstPage cannot be after currentPage"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Lcom/google/android/material/datepicker/Month;)I
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;->くし〴〺ぅ:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 1
    iget-object v0, v0, Lcom/google/android/material/datepicker/CalendarConstraints;->〺つふすそ:Lcom/google/android/material/datepicker/Month;

    .line 2
    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/Month;->ぺぁあねじ(Lcom/google/android/material/datepicker/Month;)I

    move-result p1

    return p1
.end method

.method public 〺つふすそ(I)J
    .registers 4

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;->くし〴〺ぅ:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 1
    iget-object v0, v0, Lcom/google/android/material/datepicker/CalendarConstraints;->〺つふすそ:Lcom/google/android/material/datepicker/Month;

    .line 2
    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/Month;->〳ぜぞぜべっ(I)Lcom/google/android/material/datepicker/Month;

    move-result-object p1

    .line 3
    iget-object p1, p1, Lcom/google/android/material/datepicker/Month;->〺つふすそ:Ljava/util/Calendar;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public ぁごぐすすぃ(I)Lcom/google/android/material/datepicker/Month;
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;->くし〴〺ぅ:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 1
    iget-object v0, v0, Lcom/google/android/material/datepicker/CalendarConstraints;->〺つふすそ:Lcom/google/android/material/datepicker/Month;

    .line 2
    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/Month;->〳ぜぞぜべっ(I)Lcom/google/android/material/datepicker/Month;

    move-result-object p1

    return-object p1
.end method

.method public げつ〴ぬぐ()I
    .registers 2

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;->くし〴〺ぅ:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 1
    iget v0, v0, Lcom/google/android/material/datepicker/CalendarConstraints;->ぁごぐすすぃ:I

    return v0
.end method

.method public づざかべべ(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;
    .registers 5

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〳ぜぞぜべっ;->mtrl_calendar_month_labeled:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/ぺふねづ〺;->へえどぜせ(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_2d

    new-instance p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 v0, -0x1

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;->なぎぱいぢぎ:I

    invoke-direct {p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ$げつ〴ぬぐ;

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ$げつ〴ぬぐ;-><init>(Landroid/widget/LinearLayout;Z)V

    goto :goto_32

    :cond_2d
    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ$げつ〴ぬぐ;

    invoke-direct {p1, p2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ$げつ〴ぬぐ;-><init>(Landroid/widget/LinearLayout;Z)V

    :goto_32
    return-object p1
.end method

.method public びぐびあび(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;I)V
    .registers 6

    check-cast p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ$げつ〴ぬぐ;

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;->くし〴〺ぅ:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 2
    iget-object v0, v0, Lcom/google/android/material/datepicker/CalendarConstraints;->〺つふすそ:Lcom/google/android/material/datepicker/Month;

    .line 3
    invoke-virtual {v0, p2}, Lcom/google/android/material/datepicker/Month;->〳ぜぞぜべっ(I)Lcom/google/android/material/datepicker/Month;

    move-result-object p2

    iget-object v0, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ$げつ〴ぬぐ;->ごづごきえ:Landroid/widget/TextView;

    .line 4
    iget-object v1, p2, Lcom/google/android/material/datepicker/Month;->くし〴〺ぅ:Ljava/lang/String;

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ$げつ〴ぬぐ;->ざっざへづ:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->month_grid:I

    invoke-virtual {p1, v0}, Landroid/widget/GridView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->げつ〴ぬぐ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/てぜきぽく;

    move-result-object v0

    if-eqz v0, :cond_35

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->げつ〴ぬぐ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/てぜきぽく;

    move-result-object v0

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/てぜきぽく;->〺つふすそ:Lcom/google/android/material/datepicker/Month;

    invoke-virtual {p2, v0}, Lcom/google/android/material/datepicker/Month;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_35

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->げつ〴ぬぐ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/てぜきぽく;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    goto :goto_46

    :cond_35
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/てぜきぽく;

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;->びぐびあび:Lcom/google/android/material/datepicker/DateSelector;

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;->くし〴〺ぅ:Lcom/google/android/material/datepicker/CalendarConstraints;

    invoke-direct {v0, p2, v1, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/てぜきぽく;-><init>(Lcom/google/android/material/datepicker/Month;Lcom/google/android/material/datepicker/DateSelector;Lcom/google/android/material/datepicker/CalendarConstraints;)V

    iget p2, p2, Lcom/google/android/material/datepicker/Month;->なぎぱいぢぎ:I

    invoke-virtual {p1, p2}, Landroid/widget/GridView;->setNumColumns(I)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    :goto_46
    new-instance p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/のぷのちつ;

    invoke-direct {p2, p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/のぷのちつ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;Lcom/google/android/material/datepicker/MaterialCalendarGridView;)V

    invoke-virtual {p1, p2}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method
