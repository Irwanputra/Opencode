.class public Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;
.super Landroid/widget/ListView;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ$くし〴〺ぅ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final synthetic ぺぁあねじ:I


# instance fields
.field public 〳ぜぞぜべっ:I

.field public final 〺つふすそ:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView$げつ〴ぬぐ;

.field public づざかべべ:I

.field public なぎぱいぢぎ:Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;)V
    .registers 8

    invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->〺つふすそ:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;

    check-cast p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;

    .line 1
    iget-object v0, p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->ぇいうげ〱〹:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/びぐびあび;->date_picker_view_animator_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    iput v1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->びぐびあび:I

    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/びぐびあび;->year_label_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->づざかべべ:I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/ListView;->setVerticalFadingEdgeEnabled(Z)V

    iget v1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->づざかべべ:I

    div-int/lit8 v1, v1, 0x3

    invoke-virtual {p0, v1}, Landroid/widget/ListView;->setFadingEdgeLength(I)V

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    iget-object p2, p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->〺〲に〼へ〸:Lcom/codetroopers/betterpickers/calendardatepicker/MonthAdapter$CalendarDay;

    .line 5
    iget p2, p2, Lcom/codetroopers/betterpickers/calendardatepicker/MonthAdapter$CalendarDay;->なぎぱいぢぎ:I

    :goto_3e
    iget-object v2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->〺つふすそ:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;

    check-cast v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;

    .line 6
    iget-object v2, v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->ぱでかぁ〻〹:Lcom/codetroopers/betterpickers/calendardatepicker/MonthAdapter$CalendarDay;

    .line 7
    iget v2, v2, Lcom/codetroopers/betterpickers/calendardatepicker/MonthAdapter$CalendarDay;->なぎぱいぢぎ:I

    const/4 v3, 0x0

    if-gt p2, v2, :cond_5d

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const-string v3, "%d"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_3e

    :cond_5d
    new-instance p2, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView$げつ〴ぬぐ;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぁごぐすすぃ;->calendar_year_label_text_view:I

    invoke-direct {p2, p0, p1, v0, v1}, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView$げつ〴ぬぐ;-><init>(Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;Landroid/content/Context;ILjava/util/List;)V

    iput-object p2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView$げつ〴ぬぐ;

    invoke-virtual {p0, p2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 8
    invoke-virtual {p0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    new-instance p1, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {p1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    invoke-virtual {p0, p1}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v3}, Landroid/widget/ListView;->setDividerHeight(I)V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->げつ〴ぬぐ()V

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->bpBlue:I

    iput p1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->〳ぜぞぜべっ:I

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->ampm_text_color:I

    iput p1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->ぁごぐすすぃ:I

    return-void
.end method


# virtual methods
.method public getFirstPositionOffset()I
    .registers 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_8

    return v0

    :cond_8
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    return v0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    invoke-super {p0, p1}, Landroid/widget/ListView;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x1000

    if-ne v0, v1, :cond_12

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    :cond_12
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->〺つふすそ:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;

    check-cast p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;

    .line 1
    iget-object p1, p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->へ〱そかのず:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ()V

    .line 2
    check-cast p2, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;

    if-eqz p2, :cond_61

    iget-object p1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->なぎぱいぢぎ:Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;

    const/4 p3, 0x0

    const/4 p4, 0x1

    if-eq p2, p1, :cond_21

    if-eqz p1, :cond_1a

    .line 3
    iput-boolean p3, p1, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->づざかべべ:Z

    .line 4
    invoke-virtual {p1}, Landroid/widget/TextView;->requestLayout()V

    .line 5
    :cond_1a
    iput-boolean p4, p2, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->づざかべべ:Z

    .line 6
    invoke-virtual {p2}, Landroid/widget/TextView;->requestLayout()V

    iput-object p2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->なぎぱいぢぎ:Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;

    :cond_21
    iget-object p1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->〺つふすそ:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;

    .line 7
    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 8
    check-cast p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;

    .line 9
    iget-object p5, p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->な〱ちぉじ:Ljava/util/Calendar;

    const/4 v0, 0x2

    invoke-virtual {p5, v0}, Ljava/util/Calendar;->get(I)I

    move-result p5

    .line 10
    iget-object v0, p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->な〱ちぉじ:Ljava/util/Calendar;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    invoke-static {p5, p2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->どぇぞほだ(II)I

    move-result p5

    if-le v0, p5, :cond_4e

    iget-object v0, p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->な〱ちぉじ:Ljava/util/Calendar;

    invoke-virtual {v0, v1, p5}, Ljava/util/Calendar;->set(II)V

    .line 11
    :cond_4e
    iget-object p5, p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->な〱ちぉじ:Ljava/util/Calendar;

    invoke-virtual {p5, p4, p2}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {p1}, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->がぐくいおす()V

    invoke-virtual {p1, p3}, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->ぅばづそほせ(I)V

    invoke-virtual {p1, p4}, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->せだてはぺて(Z)V

    .line 12
    iget-object p1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView$げつ〴ぬぐ;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    :cond_61
    return-void
.end method

.method public setTheme(Landroid/content/res/TypedArray;)V
    .registers 5

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogs_bpRadialPointerColor:I

    invoke-virtual {p0}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->bpBlue:I

    invoke-static {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->〳ぜぞぜべっ:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogs_bpBodyUnselectedTextColor:I

    invoke-virtual {p0}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->ampm_text_color:I

    invoke-static {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->ぁごぐすすぃ:I

    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView$げつ〴ぬぐ;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->〺つふすそ:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;

    check-cast v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->へえどぜせ()Lcom/codetroopers/betterpickers/calendardatepicker/MonthAdapter$CalendarDay;

    move-result-object v0

    iget v0, v0, Lcom/codetroopers/betterpickers/calendardatepicker/MonthAdapter$CalendarDay;->なぎぱいぢぎ:I

    iget-object v1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->〺つふすそ:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;

    check-cast v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;

    .line 1
    iget-object v1, v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->〺〲に〼へ〸:Lcom/codetroopers/betterpickers/calendardatepicker/MonthAdapter$CalendarDay;

    .line 2
    iget v1, v1, Lcom/codetroopers/betterpickers/calendardatepicker/MonthAdapter$CalendarDay;->なぎぱいぢぎ:I

    sub-int/2addr v0, v1

    .line 3
    iget v1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->びぐびあび:I

    div-int/lit8 v1, v1, 0x2

    iget v2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;->づざかべべ:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    .line 4
    new-instance v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/づざかべべ;

    invoke-direct {v2, p0, v0, v1}, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/づざかべべ;-><init>(Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;II)V

    invoke-virtual {p0, v2}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
