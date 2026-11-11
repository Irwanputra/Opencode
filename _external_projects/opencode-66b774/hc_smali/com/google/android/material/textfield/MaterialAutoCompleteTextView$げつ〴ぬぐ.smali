.class public Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    const/4 v0, 0x0

    if-gez p3, :cond_16

    .line 1
    iget-object p1, p1, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;->づざかべべ:Landroidx/appcompat/widget/ListPopupWindow;

    .line 2
    invoke-virtual {p1}, Landroidx/appcompat/widget/ListPopupWindow;->〺つふすそ()Z

    move-result v1

    if-nez v1, :cond_f

    move-object p1, v0

    goto :goto_1e

    :cond_f
    iget-object p1, p1, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    invoke-virtual {p1}, Landroid/widget/ListView;->getSelectedItem()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1e

    .line 3
    :cond_16
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p1

    invoke-interface {p1, p3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    :goto_1e
    iget-object v1, p0, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    invoke-static {v1, p1}, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;->げつ〴ぬぐ(Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v1

    if-eqz v1, :cond_78

    if-eqz p2, :cond_34

    if-gez p3, :cond_30

    goto :goto_34

    :cond_30
    :goto_30
    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    goto :goto_6f

    :cond_34
    :goto_34
    iget-object p1, p0, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    .line 4
    iget-object p1, p1, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;->づざかべべ:Landroidx/appcompat/widget/ListPopupWindow;

    .line 5
    invoke-virtual {p1}, Landroidx/appcompat/widget/ListPopupWindow;->〺つふすそ()Z

    move-result p2

    if-nez p2, :cond_40

    move-object p2, v0

    goto :goto_47

    :cond_40
    iget-object p1, p1, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    invoke-virtual {p1}, Landroid/widget/ListView;->getSelectedView()Landroid/view/View;

    move-result-object p1

    move-object p2, p1

    .line 6
    :goto_47
    iget-object p1, p0, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    .line 7
    iget-object p1, p1, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;->づざかべべ:Landroidx/appcompat/widget/ListPopupWindow;

    .line 8
    invoke-virtual {p1}, Landroidx/appcompat/widget/ListPopupWindow;->〺つふすそ()Z

    move-result p3

    if-nez p3, :cond_54

    const/4 p1, -0x1

    const/4 p3, -0x1

    goto :goto_5b

    :cond_54
    iget-object p1, p1, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    invoke-virtual {p1}, Landroid/widget/ListView;->getSelectedItemPosition()I

    move-result p1

    move p3, p1

    .line 9
    :goto_5b
    iget-object p1, p0, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    .line 10
    iget-object p1, p1, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;->づざかべべ:Landroidx/appcompat/widget/ListPopupWindow;

    .line 11
    invoke-virtual {p1}, Landroidx/appcompat/widget/ListPopupWindow;->〺つふすそ()Z

    move-result p4

    if-nez p4, :cond_68

    const-wide/high16 p4, -0x8000000000000000L

    goto :goto_30

    :cond_68
    iget-object p1, p1, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    invoke-virtual {p1}, Landroid/widget/ListView;->getSelectedItemId()J

    move-result-wide p4

    goto :goto_30

    .line 12
    :goto_6f
    iget-object p1, p0, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    .line 13
    iget-object p1, p1, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;->づざかべべ:Landroidx/appcompat/widget/ListPopupWindow;

    .line 14
    iget-object v2, p1, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    .line 15
    invoke-interface/range {v1 .. v6}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    :cond_78
    iget-object p1, p0, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    .line 16
    iget-object p1, p1, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;->づざかべべ:Landroidx/appcompat/widget/ListPopupWindow;

    .line 17
    invoke-virtual {p1}, Landroidx/appcompat/widget/ListPopupWindow;->dismiss()V

    return-void
.end method
