.class public Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:I

.field public final synthetic びぐびあび:Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;


# direct methods
.method public constructor <init>(Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;II)V
    .registers 4

    iput-object p1, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/づざかべべ;->びぐびあび:Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;

    iput p2, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/づざかべべ;->〺つふすそ:I

    iput p3, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/づざかべべ;->くし〴〺ぅ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 4

    iget-object v0, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/づざかべべ;->びぐびあび:Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;

    iget v1, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/づざかべべ;->〺つふすそ:I

    iget v2, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/づざかべべ;->くし〴〺ぅ:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    iget-object v0, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/づざかべべ;->びぐびあび:Lcom/codetroopers/betterpickers/calendardatepicker/YearPickerView;

    invoke-virtual {v0}, Landroid/widget/ListView;->requestLayout()V

    return-void
.end method
