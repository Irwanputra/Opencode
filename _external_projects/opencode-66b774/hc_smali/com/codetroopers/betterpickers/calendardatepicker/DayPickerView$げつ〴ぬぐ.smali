.class public Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;


# direct methods
.method public constructor <init>(Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;)V
    .registers 2

    iput-object p1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 6

    iget-object v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    iget v1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->〺つふすそ:I

    iput v1, v0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;->〳ぜぞぜべっ:I

    const-string v0, "MonthFragment"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    iget v0, v0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;->ぁごぐすすぃ:I

    :cond_13
    iget v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->〺つふすそ:I

    if-nez v0, :cond_79

    iget-object v1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    iget v2, v1, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;->ぁごぐすすぃ:I

    if-eqz v2, :cond_79

    const/4 v3, 0x1

    if-eq v2, v3, :cond_79

    iput v0, v1, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;->ぁごぐすすぃ:I

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    :goto_28
    if-eqz v1, :cond_38

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v4

    if-gtz v4, :cond_38

    iget-object v1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    goto :goto_28

    :cond_38
    if-nez v1, :cond_3b

    return-void

    :cond_3b
    iget-object v2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v2

    iget-object v4, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    invoke-virtual {v4}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v4

    if-eqz v2, :cond_53

    iget-object v2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getCount()I

    move-result v2

    sub-int/2addr v2, v3

    if-eq v4, v2, :cond_53

    goto :goto_54

    :cond_53
    const/4 v3, 0x0

    :goto_54
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    iget-object v2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    if-eqz v3, :cond_7d

    const/4 v3, -0x1

    if-ge v0, v3, :cond_7d

    const/16 v3, 0xfa

    if-le v1, v2, :cond_73

    iget-object v1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    invoke-virtual {v1, v0, v3}, Landroid/widget/ListView;->smoothScrollBy(II)V

    goto :goto_7d

    :cond_73
    iget-object v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    invoke-virtual {v0, v1, v3}, Landroid/widget/ListView;->smoothScrollBy(II)V

    goto :goto_7d

    :cond_79
    iget-object v1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;

    iput v0, v1, Lcom/codetroopers/betterpickers/calendardatepicker/DayPickerView;->ぁごぐすすぃ:I

    :cond_7d
    :goto_7d
    return-void
.end method
